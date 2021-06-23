# RPS-Bot Contributing Guide

## Contributing
This project welcomes you to submit your own bot, you can run your bot against an existing bot and see who will win. You may submit any amount of bots as long as there is a meaningful difference between each of them.

## Requirements
- Must be written in Java
- No purely random bots
- Do not cheat and look at other bots to make a hard counter. Be original.
- Do not attempt to "hack" any part of the code. If you find a bug, report it in issues or fix it in a separate PR
- Name should start with your GitHub Username followed by a one-word description of the bot (Eg. DarthAVOppositeBot)
- All bot code should be in the ```/src/rps/``` folder.

Bots that do not meet these requirements will not be merged.

## Components of a bot
There are going to be two main things in the template you’ll have to fill out for your rock-paper-scissors bot: the play function and the getResult function. 

```char play(void)``` : Return either the character ‘r’, ‘p’ or ‘s’ to indicate what your bot will play. You can use information from prior games to try to determine what the opponent will play next.

```void getResult(char yourMove, char theirMove)``` : Your bot is reminded of what it played, as well as told what the opponent played in response. Your bot can then use this information to try to predict what the opponent is doing. 

Note that every bot that cannot adapt has a hard-counter bot. Can you write a bot that nobody else can satisfactorily counter?

## Adding a bot
Once you have a bot that meets all the requirements, create a pull request and it will be reviewed. It will soon be merged and available for everyone to use. If you do not know how to create a pull request for Open Source repositories, please read [this tutorial made by Digital Ocean](https://www.digitalocean.com/community/tutorials/how-to-create-a-pull-request-on-github)


## Examples
### ExampleRockBot
```
char play(){
	return ‘r’; //note that this is in lowercase!
}
void getResult(char yourMove, char theirMove){
	return; //RockBot doesn’t care because they always play rock
}
```

### ExampleCopyBot
```
char copy = ‘r’; //initialized as rock because why not; it has to start somewhere
char play(){
	return copy;
}
void getResult(char yourMove, char theirMove){
	copy = theirMove; //sets the move to copy 
	return;
}
```

## Why Random bots are prohibited
It makes everything even out at 50% and makes competitions not very interesting. 
