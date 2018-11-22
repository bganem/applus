package i18n;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class TeleLogin {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// TeleLogin
	public static Var CriarUsuario() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				if (Var.valueOf(!cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.senha"))
						.equals(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.confirmasenha"))))
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("error"), Var.valueOf("A senha digitada não confere com a confirmação."));
				} else {
					cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),
							Var.valueOf("password",
									cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.senha"))),
							Var.valueOf("name", cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.nome"))),
							Var.valueOf("login", cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.login"))),
							Var.valueOf("email", cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.email"))));
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("error"), Var.valueOf(
									"Usuário cadastrado com sucesso! \nAtualize seu navegado  (tecla F5)\nEntre no sistema usando seu email como login."));
				}
				return Var.VAR_NULL;
			}
		}.call();
	}

}
