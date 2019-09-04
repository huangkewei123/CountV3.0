package com.court.jee.utils.http;

import org.apache.http.client.methods.*;

/**
 * @description 请求类型
 * @date 2019年7月10日 下午10:18:29
 * @since JDK1.7
 */
public enum RequestType {

	POST{
		@Override
		public HttpRequestBase getHttpType(String url) {
			return new HttpPost(url);
		}
	},
	GET{
		@Override
		public HttpRequestBase getHttpType(String url) {
			return new HttpGet(url);
		}
	},
	DELETE{
		@Override
		public HttpRequestBase getHttpType(String url) {
			return new HttpDelete(url);
		}
	},
	PUT{
		@Override
		public HttpRequestBase getHttpType(String url) {
			return new HttpPut(url);
		}
	},
	
	;
	
   public abstract HttpRequestBase getHttpType(String url);
}
