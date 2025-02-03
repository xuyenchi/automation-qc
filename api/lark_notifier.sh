#!/bin/bash

MSG=$1
#payload for lark
PAYLOAD="{\"content\":{\"text\":\"$MSG\"},\"msg_type\":\"text\"}"

#HOOK
HOOK=https://open.larksuite.com/open-apis/bot/v2/hook/0f271c16-5fb2-47fd-87ba-347e22f8655e

#curl
curl -X POST -H "Content-Type: application/json" -d "$PAYLOAD" $HOOK