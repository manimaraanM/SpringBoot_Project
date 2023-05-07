DROP TABLE IF EXISTS player_bowling_stats;
DROP TABLE IF EXISTS PlayerBattingStats;
DROP TABLE IF EXISTS player_role;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS players;

CREATE TABLE players (
player_id INT AUTO_INCREMENT NOT NULL,
  player_name VARCHAR(128) NOT NULL,
  team_name VARCHAR(32),
  age INT,
  birth_place VARCHAR(128),
  matches long,
  batting_style VARCHAR(32),
  bowling_style VARCHAR(32),
  PRIMARY KEY (player_id)
  UNIQUE KEY(player_name,team_name);
);

CREATE TABLE roles (
  role_id INT AUTO_INCREMENT NOT NULL,
  role_name VARCHAR(45) NOT NULL, 
  PRIMARY KEY (role_id)
   UNIQUE KEY(role_name);
);


CREATE TABLE player_role (
player_id INT,
role_id INT,
FOREIGN KEY(player_id) REFERENCES players(player_id) ON DELETE CASCADE,
FOREIGN KEY(role_id) REFERENCES roles(role_id) ON DELETE CASCADE
);

CREATE TABLE PlayerBattingStats(
   player_id INT,
  matches INT,
  total_runs long,
  highest_score long,
  fiftys long,
  hundreds long,
  FOREIGN KEY(player_id) REFERENCES players(player_id) ON DELETE CASCADE
  UNIQUE KEY (player_id)
);

CREATE TABLE player_bowling_stats (
  player_id INT,
  matches INT,
  total_wickets long,
  best_bowling VARCHAR(32),
  five_wickets long,
  FOREIGN KEY(player_id) REFERENCES players(player_id) ON DELETE CASCADE
  UNIQUE KEY (player_id)
);

