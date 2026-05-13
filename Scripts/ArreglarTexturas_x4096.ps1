Get-ChildItem *.png | ForEach-Object {
    $size = magick identify -format "%wx%h" $_.Name
    if ($size -eq "4096x4096") {
        Write-Host "Redimensionando: $($_.Name)"
        magick mogrify -resize 1024x1024! $_.Name
    }
}