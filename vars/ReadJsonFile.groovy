import com.dev.util.JsonUtil

def call(body){
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    JsonObject jsonObj = JsonUtil.loadJson(config.jsonData)
    return jsonObj
}
