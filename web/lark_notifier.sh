#!/bin/bash

MSG=$1
#payload for lark
PAYLOAD="{\"content\":{\"text\":\"$MSG\"},\"msg_type\":\"text\"}"

#HOOK
HOOK=https://open.larksuite.com/open-apis/bot/v2/hook/781c29db-47f4-4372-8b79-7cd88a5bdebb

#curl
curl -X POST -H "Content-Type: application/json" -d "$PAYLOAD" $HOOK
