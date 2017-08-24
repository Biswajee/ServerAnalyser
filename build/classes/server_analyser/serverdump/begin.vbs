set shell=CreateObject("Shell.Application")
' shell.ShellExecute "application", "arguments", "path", "verb", window
shell.ShellExecute "initialize.bat",,"\serverdump\", "runas",0
set shell=nothing