db.createUser({
  user: "root",
  pwd: "M30uuZBy60owRak",
  roles: [
    {
      role: "readWrite",
      db: "logsdb",
    },
  ],
});
