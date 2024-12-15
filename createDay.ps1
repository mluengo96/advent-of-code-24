param (
    [int]$day
)

### To run this run ".\createDay.ps1 -day 1" and replace "1" with the day you want to create (WINDOWS)

# Zero-pad the day number
$dayPadded = $day.ToString("D2")

# Define the paths for the new day
$kotlinPath = "src\main\kotlin\day$dayPadded"
$resourcesPath = "src\main\resources\day$dayPadded"

# Create the Kotlin package and resources folder
New-Item -ItemType Directory -Path $kotlinPath -Force
New-Item -ItemType Directory -Path $resourcesPath -Force

# Copy and modify the template file
$templatePath = "src\main\kotlin\DayTemplate.kt"
$destinationPath = "$kotlinPath\Day$dayPadded.kt"
Copy-Item -Path $templatePath -Destination $destinationPath

# Replace placeholders in the template file
(Get-Content -Path $destinationPath) -replace "dayX", "day$dayPadded" -replace "DayX", "Day$dayPadded" |
    Set-Content -Path $destinationPath

# Create empty input files
New-Item -ItemType File -Path "$resourcesPath\day$dayPadded.txt" -Force
New-Item -ItemType File -Path "$resourcesPath\day${dayPadded}_test.txt" -Force

Write-Output "Day $day setup completed."
