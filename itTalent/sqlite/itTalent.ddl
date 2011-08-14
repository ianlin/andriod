
CREATE TABLE talent(
    ID char(50) primary key,
    name TEXT not null,
    first_name char(50),
    last_name  char(50),
    cell_phone TEXT,
    email TEXT,
    birth_year INTEGER,
    birth_date TEXT,
    self_skill_desc TEXT,
    desc TEXT
);

CREATE TABLE contact(
    talent_ID char(50),
    desc TEXT,
    FOREIGN KEY(talent_ID) REFERENCES talent(ID)
);

CREATE TABLE talent_story(
    talent_ID char(50),
    story_ID char(50),
    confident_level_ID char(10),
    type_ID char(10), 
    start_date char(20),
    end_date char(20),
    desc TEXT,
    PRIMARY KEY(talent_ID, story_ID),
    FOREIGN KEY(talent_ID) REFERENCES talent(ID),
    FOREIGN KEY(type_ID) REFERENCES type(ID),
    FOREIGN KEY(confident_level_ID) REFERENCES confident_leve(ID)
);

CREATE TABLE endorsement(
    ID char(50) primary key,
    talent_ID char(50),
    story_ID char(50),
    endorser_ID char(50),
    endorser_comment TEXT,
    desc TEXT 
);

CREATE TABLE confident_level(
    ID char(10) primary key,
    desc TEXT
);

CREATE TABLE type(
    ID char(10) primary key,
    desc TEXT
);

