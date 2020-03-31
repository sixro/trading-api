Java Trading Api
==================


Summary
---------

  * [Introduction](#intro)
  * [Usage](#usage)
  * [Where to get help](#help)
  * [Contribution guidelines](#contribution)
  * [Contributors](#contributors)
  * [Credits, Inspiration, Alternatives](#credit-etc)


<a name="intro" />Introduction
--------------------------------

The aim of this library is to create a standard library to allow:

   1. the development of trading applications based on this api allowing the change of brokers, data providers, etc... without any pain
   2. the development of new integrations with brokers, data providers, etc...

Disclaimer: this project is not promoted by [Oracle](https://www.oracle.com) and I'm not sure I can use the word *Java* in the project name.
If this is against the regulations defined by [Oracle](https://www.oracle.com), please let me know and I'll change the name.


<a name="usage" />Usage
--------------------------------

TODO


<a name="help" />Where to get help
--------------------------------

To get help, open an issue. In the future I hope to provide help using something else...


<a name="contribution" />Contribution guidelines
--------------------------------

All contributions are welcome. The project uses a MIT License (as you can see in the root of the project). All you need to do is fork the project and send me a pull-request. Thanks!
I'll mention all contributors in the section [Contributors](#contributors).

<a name="contributors" />Contributors
--------------------------------

  * [Sixro](https://github.com/sixro/)


<a name="credit-etc" />Credits, Inspiration, Alternatives
--------------------------------

I created this library, because at the moment I have a good strategy but I open/close manually each order.  
When the number of orders to open is more than one, I have to open all of them in sequence and this requires some time.  
Besides, it is of course an error prone activity... I made some mistakes.  
This is a job for a software.  
Every broker has its own api. Their object names. Their functions.  
Where you develop a strategy, you are totally coupled with that broker.
This is the same happened in the past and the answer of Java was to create a standard api.  
I'm trying to the same.  
Let's see what happens ;-)




