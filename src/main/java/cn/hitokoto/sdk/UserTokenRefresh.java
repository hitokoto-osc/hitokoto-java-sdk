package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class UserTokenRefresh extends cn.hitokoto.Request
{
    public HttpResponse<String> request()
    {
        URI uri = new URI("/user/token/refresh");
        uri.withToken(this.getToken());

        return Request.put(uri, new HashMap<>());
    }
}
