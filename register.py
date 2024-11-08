from pathlib import Path
from typing import List
import json

def traverse_directory_pathlib(path) -> List[Path]:
    p = Path(path)
    l = []
    for item in p.rglob('*'):
        if item.is_dir():
            l.extend(traverse_directory_pathlib(item))
        elif item.is_file():
            l.append(item)
    return l

path = './src/main/resources/assets/tpow/textures'
path_new:Path = Path('./src/main/resources/assets/tpow/models/item')

for file in traverse_directory_pathlib(path):
    file_name = file.name.replace('.png', '')
    print(file_name)
    # print(f"""    public static final Item {file_name.upper()} = registerItems("{file_name}", new Item(new Item.Settings().maxCount(64)));""")
    d = {"parent": "minecraft:item/generated","textures": {"layer0": f"tpow:item/{file_name}"}}
    with open(path_new / (file.name.replace('.png','') + '.json'), 'w') as f:
        
        json.dump(d, f, indent=4)
