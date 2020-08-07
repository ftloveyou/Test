package demo04;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import com.aliyuncs.facebody.model.v20191230.*;

public class RecognizeFace {

    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        RecognizeFaceRequest request = new RecognizeFaceRequest();
        request.setRegionId("cn-shanghai");
        request.setImageURL("http://viapi-test.oss-cn-shanghai.aliyuncs.com/sanjiye-meizi/%E4%BA%BA%E8%84%B8%E5%B1%9E%E6%80%A7%E8%AF%86%E5%88%AB.jpg");

        try {
            RecognizeFaceResponse response = client.getAcsResponse(request);
            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
}

