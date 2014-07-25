Sky Block
========
*Minecraft plug-in for Bukkit servers*

***By: Quinn Henckel***

##Installation##
1. Install dependencies.
2. Download the SkyBlock_VX-X_MCX-X-X.jar
3. Put it in your server's "plugins" folder.
4. Reload or Restart your server.

##Dependencies##
- World Edit
*(Be sure you have the right version installed)*

##Set up##
After you have installed the plug-in you can change the "config.yml" in "plugins\SkyBlock"
It is fully commented and should be self explanatory.
If you want to restore the defaults just delete the "config.yml" it will be recreated with the default values. 

##Commands##
***Commands for Players:***
- /island help
- /island create
- /island home
- /island add (player name)
- /island remove (player name)
- /island delete
- /island visit (player name)

***Commands for the server or operators:***
- /island world setup
- /island world reload
- /island islands list
- /island islands reload
- /island owners list
- /island owners reload

##List of Files that will be Created##
*(The .sb file format is just a .txt file used as a database)*
- islands.sb
- owners.sb
- island.schematic