Get-ChildItem *.png | ForEach-Object {
    $size = magick identify -format "%wx%h" $_.Name
    if ($size -eq "2048x2048") {
        Write-Host "Redimensionando: $($_.Name)"
        magick mogrify -resize 1024x1024! $_.Name
    }
}