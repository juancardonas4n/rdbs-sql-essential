# Podcast

## Use Case

* Login
* Create new podcast
* Getting a list of podcast, including matching with a particular podcast title
* Create new customer
* Customer subscribing to a podcast - Association

## Resource

### Authentification

* Login
  * Protocol - HTTPS

### Podcast

* Creating a podcast
  * Protocol - HTTP
  * End Point - `http://servername.com:8080/podcasts` <!-- plural -->
  * URI Design - `http://servername.com:8080/podcasts`
                 `http://servername.com:8080/podcasts?limit=<limit>&offset=<offset>` <!-- pagining -->
                 `http://servername.com:8080/podcasts?limit=<limit>`
* Searching a podcast
  * Protocol - HTTP
  * End Point - `http://servername.com:8080/podcasts`
  * End Point - `http://www.macmillandictonary.com/dictonary/
  * URI Design - `http://www.macmillandictonary.com/dictonary/<english>/<word>`
  * <english> - america or uk 
  * URI Design - `http://servername.com:8080/podcasts?title=<title>`
  * Representation
  * HTML
* Represation
  * JSON
```json
{ "podcasts" :
  [{ "id" : 1,
     "title" : "itune podcasts",
     "feed"  : "http://www.itunes.com",
     ...
   },
   { "id" : 2,
     "title" : "Bad Bunny",
     "feed"  : "http://www.spotify.com/?name=Bad%20Bunny",
     ...
   }]
}
```
     * Content type - `application/json`
     * Query parameter - `type`
     * HTTP method - `GET`
     * HTTP headers - `Expires: ...`
                      `Cache-Control: ...`
     * HTTP method  - `POST`
       * POST BODY - `title=<title>`
     * HTTP status code - `200` - `OK`, `400`, `500`
  * XML
```xml
<podcasts>
  <podcast>
     <id>1</id>
     <title>"itune podcasts"</title>
     <feed>http://www.itunes.com</feed>
     ...
  </podcast>
  <podcast>
     <id>2</id>
     <title>"Bad Bunny"</title>
     <feed>http://www.spotity.com/?name=Bad%20Bunny</feed>
     ...
  </podcast>
</podcasts>
```
     * Content type - `text/xml`
     * Query parameter - `type`
     * HTTP method - `GET`, `POST`
     * HTTP status code - `200` - `OK`, `400`, `500`

### Customers

* Creating a customer
  * Protocol - `HTTP`
  * End Point - `http://servername.com:8080/customers`
  * URI Design - `http://servername.com:8080/customers`
* Customer subscribing to podcast
  * Protocol - `HTTP`
  * End Point - `http://servername.com:8080/customers`
  * URI Design - `http://servername.com:8080/customers/{id}/podcast/{id}`
* Representation
  * JSON
```json
{ "customers" :
  [ { "id" : 1, 
      "name" : "Juan Cardona",
      "email" : "Juan_Cardona@epam.com"
      "podcasts" : [ "http://servername.com:8080/podcast?title="itune potcast",
                     "http://servername.com:8080/podcast?title="Bad Bunny" ]
    },
    { "id": 2,
      "name" : ...
    }]
   ...
}
```
