# Need to run all the lines below in PowerShell to correctly display:

[Console]::InputEncoding = [System.Text.UTF8Encoding]::new();
[Console]::OutputEncoding = [System.Text.UTF8Encoding]::new();
$PSDefaultParameterValues['*:Encoding'] = 'utf8';
$PSDefaultParameterValues['Out-File:Encoding'] = 'utf8';
$env:JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8";

./mysql -u root -p










