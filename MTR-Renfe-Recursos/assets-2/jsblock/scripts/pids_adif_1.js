include(Resources.id("jsblock:scripts/pids_adif_1_util.js"));


function create(ctx, state, pids) {
    print("Hello World ^^");
}
function render(ctx, state, pids) {
    //Change this for other languages >.<
    let depart = "SALIDAS"
    let firstColText1 = "Vía"
    let secondColText1 = "Destino"
    let thirdColText1 = "Próximo tren"
    let firstColpos = 4
    let secondColpos = 30
    let thirdColpos = 75
    let firstRowpos = 12
    let secondRowpos = 19

    let whiteColor = 0xFFFFFF
    let orangeColor = 0xF9B208

    //Background picture
    Texture.create("Background") // <----------
    .texture("jsblock:textures/adif_pids.png")
    .size(pids.width, pids.height)
    .draw(ctx);

    Text.create()
    .text(depart)
    .color(whiteColor)
    .pos(1, 1) // <----
    .scale(1.1)
    .draw(ctx);

    Text.create()
    .text(firstColText1)
    .color(whiteColor)
    .pos(firstColpos, firstRowpos) // <----
    .font("renfe:vialog_pids")
    .draw(ctx);

    Text.create()
    .text(secondColText1)
    .color(whiteColor)
    .pos(secondColpos, firstRowpos) // <----
    .draw(ctx);

    Text.create()
    .text(thirdColText1)
    .color(whiteColor)
    .pos(thirdColpos, firstRowpos) // <----
    .draw(ctx);

    for(let i = 0; i <= pids.rows -1; i++) {
        let rowY = 25 + (i*12.75);
        let arrival = pids.arrivals().get(i);
        if(arrival != null && !pids.isRowHidden(i)) {
            Text.create("Platform Circle Text")
            .text(arrival.platformName()) // We can use platformName() to obtain the platform no.
            .pos(firstColpos + 3, rowY + 1)
            .scale(0.9)
            .color(orangeColor)
            .draw(ctx);

            Text.create()
            .text(TextUtil.cycleString(arrival.destination()))
            .color(orangeColor)
            .pos(secondColpos, rowY)
            .scale(0.7)
            .draw(ctx);
            
            Text.create() // <----
            .text(TextUtil.cycleString(PIDSCustomUtil.getETAText(arrival.arrivalTime())))
            .color(orangeColor)
            .pos(thirdColpos+15, rowY)
            .scale(0.7)
            .draw(ctx);
            
            
        }
    }

}
function dispose(ctx, state, pids) {
    print("Goodbye World ^^;");
}