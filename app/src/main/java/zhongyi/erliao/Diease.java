package zhongyi.erliao;

/**
 * Created by dell on 2017/2/2.疾病模型层，将二级界面以及诊断内容封装起来。
 */
public class Diease {
    private String Title;
    private String content;

    public void setTitle(String title) {
        this.Title=title;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
