const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
  res.send('Hello World!')
  res.status(res, rec, 500)
})
app.get('/hest', (req, res) => {
    res.send('<h1> PRUUUUH HEST </h1>')
})

app.get('/api/hest', (req, res) => {
    res.send('{"hest":"hingst", "rytter":"Lau"}')
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})