#!/bin/bash 
java -cp .:lib/dxfeed-samples.jar:lib/qds.jar:lib/qds-file.jar -Ddxfeed.address=file:demo-sample.data[cycle] com.dxfeed.sample.api.DXFeedConnect Quote IBM