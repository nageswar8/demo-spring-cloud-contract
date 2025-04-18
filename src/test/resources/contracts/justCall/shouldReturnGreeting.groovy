package contracts.justCall

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        urlPath('just/abc')
    }
    response {
        status 200
        body("Hey this is your code bro : abc")
        headers {
            contentType(textPlain())
        }
    }
}