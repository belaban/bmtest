#!/bin/bash


java -cp target/classes:target/dependency/* -javaagent:target/dependency/byteman-4.0.19.jar=script:target/classes/test.bm  com.bela.Test