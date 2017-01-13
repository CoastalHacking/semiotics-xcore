
# Purpose

[EMF](https://en.wikipedia.org/wiki/Eclipse_Modeling_Framework) /
[Xcore](https://wiki.eclipse.org/Xcore)-based model and UI note taking application 

## Build

`mvn clean install`

## Project Layout

The project layout is based on
[Vogella's Tycho recommendations](http://blog.vogella.com/2015/12/15/pom-less-tycho-builds-for-structured-environments/), with the following minor changes:

* `root` &rarr; `aggregator` (the POM in this directory)
* `configuration` &rarr; `parent`
