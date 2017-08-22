set shell=CreateObject("Shell.Application")
' shell.ShellExecute "application", "arguments", "path", "verb", window
shell.ShellExecute "initialize.bat",,"C:\Users\HP\Documents\response\Server_Analyser\src\server_analyser\serverdump\", "runas",0
set shell=nothing