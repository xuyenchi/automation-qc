#!/bin/bash

MSG=$1
#payload for lark
PAYLOAD="{\"content\":{\"text\":\"$MSG\"},\"msg_type\":\"text\"}"

#HOOK
HOOK=https://open.larksuite.com/open-apis/bot/v2/hook/abc

#curl
curl -X POST -H "Content-Type: application/json" -d "$PAYLOAD" $HOOK