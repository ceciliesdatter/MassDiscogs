import configparser
from spotify import *

SETTINGS_PATH = "."


def main():
    config = configparser.ConfigParser()
    build_artist_list_from_saved_tracks()
    return 0
