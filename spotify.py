import asyncio
import json
import os
import webbrowser

import requests
import spotipy


def spotify_auth():
    import json
    import os

    load_dotenv()
    content = os.getenv("CONTENT-TYPE")
    # print(str(content))
    id_token = os.getenv("ID")
    # print(str(id_token))
    token = os.getenv("secret")
    # print(str(token))
    header = {"Content-Type": content}
    body = {
            "response_type": "code",
            "client_id": id_token,
            "scope": "user-library-read",
            "redirect_uri": "http://localhost:8888/callback"
    }
    print(header, body)
    connection = requests.get(headers=header, params=body, url="https://accounts.spotify.com/autorize")
    print(connection.content)
    response = connection.content
    webbrowser.open_new_tab(str(response))
    print(response)
    return response

def build_artist_list_from_saved_tracks():
    from dotenv import load_dotenv
    import spotipy.util as util

    load_dotenv()
    params = dict(client_id=os.getenv("ID"), client_secret=os.getenv("secret"),
                  redirect_uri='https://localhost:8888/callback', scope='user-library-read')
    auth = requests.get(params=params,
    print(auth)
    sp = spotipy.Spotify(auth)
    response_code = 0
    offset_counter = 0
    total = 7900
    file = open("artists.txt", mode="w", encoding="utf-8")
    print("Fetching tracks...")
    while total - offset_counter > 50:
        tracks = sp.current_user_saved_tracks(limit=50, offset=offset_counter, market="DE")
        print("fetching tracks " + str(offset_counter) + " - "
              + str(offset_counter + 50) + " of " + str(total))
        print(tracks)
        total: int = len(tracks)
        for x in tracks:
            artists = x["track"]["artists"]
            for y in artists:
                file.write(y["name"])
    offset_counter += 50
    print("Fetched all tracks")
