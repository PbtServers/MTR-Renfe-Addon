include(Resources.id("jsblock:scripts/pids_cercanias_es_util.js"));
include(Resources.id("jsblock:scripts/pids_util.js"));

function create(ctx, state, pids) {
    print("Hello World ^^");
}

function render(ctx, state, pids) {
    let whiteColor = 0xFFFFFF;

    let arrival = pids.arrivals().get(0);
    Texture.create("Background") // <----------
    .texture("jsblock:textures/background_cercanias.png")
    .size(pids.width, pids.height)
    .draw(ctx);

    if (arrival != null && !pids.isRowHidden(0)) {
        let willArriveIn = arrival.arrivalTime() - Date.now();
        let stops = arrival.route().getPlatforms().toArray().map((platform) => platform.stationName);
        let stops_at = ""
        let stationClean = pids.station().getName().normalize("NFC").trim();
        let i = stops.findIndex(s => s.normalize("NFC").trim() === stationClean) + 1;

        for (let x = 0; i < stops.length; i++) {
            stops_at += stops[i].replace("|", " ")
            if (i == (stops.length - 2)) {
                stops_at += " y "
            } else if (i == (stops.length - 1)){
                stops_at += "."
            } else if(i !== (stops.length - 1)) {
                stops_at += ", "
            }
        }

        if (willArriveIn <= 10000) {
            Texture.create("Route Colored")
                .texture("jsblock:textures/white_route_template.png")
                .color(arrival.routeColor()) // Note this part!
                .pos(0, 0)
                .size(50, 60)
                .draw(ctx);

            Texture.create("Route Colored")
                .texture("jsblock:textures/white_route_template.png")
                .color(arrival.routeColor()) // Note this part!
                .pos(0, 60)
                .size(pids.width, 1)
                .draw(ctx);

            let words = arrival.routeNumber().split("\\|");
            for (let j = 0; j < words.length; j++) {
                Text.create("Ruta")
                    .text(words[j])
                    .color(whiteColor)
                    .centerAlign()
                    .size(24,20)
                    //.scaleXY()
                    .stretchXY()
                    .pos(25, 10 + (j * 20))
                    .scale(2)
                    .draw(ctx);
            }
            Text.create()
                .text("Destino:")
                .color(arrival.routeColor())
                .pos(50, 1)
                .scale(1.1)
                .draw(ctx);

            Text.create()
                .text("Tiempo estimado:")
                .color(arrival.routeColor())
                .pos(0, 63.65)
                .scale(0.9)
                .draw(ctx);
                    
            Text.create("Estación destino")
                .text(TextUtil.cycleString(arrival.destination()))
                .color(whiteColor)
                .pos(50, 11)
                .scale(0.9)
                .draw(ctx);

            Text.create()
                .text("Con parada en:")
                .color(arrival.routeColor())
                .pos(50, 35)
                .scale(1.1)
                .draw(ctx);

            Text.create("Estaciones que para")
                .text(stops_at)
                .color(whiteColor)
                .size(80, 6)
                .marquee()
                .pos(50, 47)
                .scale(1)
                .draw(ctx);
                
            Text.create("ETA.")
                .text(PIDSCustomUtil.getETAText(arrival.arrivalTime()))
                .color(whiteColor)
                .pos(71, 63.65)
                .scale(0.9)
                .draw(ctx);
        } else {

            Texture.create("Ferrocarril Logo")
                .texture("jsblock:textures/renfe-logo-white.png")
                .pos(2, 14)
                .size(90, 45)
                .draw(ctx);

            Text.create("Clock")
                .text(PIDSCustomUtil.formatTime(MinecraftClient.worldDayTime(), true)) // Note this here!
                .color(0xFFFFFF)
                .pos(96, 32)
                .scale(1.5)
                .draw(ctx);
        }
    } else {
        Texture.create("Ferrocarril Logo")
                .texture("jsblock:textures/renfe-logo-white.png")
                .pos(2, 14)
                .size(90, 45)
                .draw(ctx);

            Text.create("Clock")
                .text(PIDSCustomUtil.formatTime(MinecraftClient.worldDayTime(), true)) // Note this here!
                .color(0xFFFFFF)
                .pos(96, 32)
                .scale(1.5)
                .draw(ctx);
    }
}
function dispose(ctx, state, pids) {
    print("Goodbye World ^^;");
}