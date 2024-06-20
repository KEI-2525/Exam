// パッケージ(ディレクトリ)の指定
package chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// クラスと対応するURLを指定
//  パッケージ名とクラス名になるようにする
@WebServlet(urlPatterns={"/chapter3/hello"})
/**
* Helloクラス
* HttpServletのサブクラス
* @author k_takemura
*
*/
public class Hello extends HttpServlet {
	/**
	 * doGetメソッド
	 * GETでのリクエストに対するレスポンスを定義
	 *  GET...通常のデータ(画面)取得の通信
	 *
	 *  @param HttpServletRequest request : なんか
	 *  @param HttpServletResponse response : なんか
	 */
	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
//		レスポンスに書き込むためのライターを取得
		PrintWriter out=response.getWriter();
		out.println("Hello!");
		out.println(new java.util.Date());
	}

//	@Override
//	protected void doPost(HttpServletRequest, )
}