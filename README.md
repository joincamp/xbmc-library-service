xbmc-library-service
====================

A standalone service for serving a subset of http://wiki.xbmc.org/index.php?title=JSON-RPC_API

Motivation: A Raspberry Pi or other lightweight computer makes a great media client, but is slow to serve json requests about the media library. The goal is to serve these requests from a more capable server without running the whole of XBMC (ie. a headless server).
