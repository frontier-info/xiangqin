package jp.frontierinfo.api.abstractcls;

public interface AbstractService<I, O> {

	O execute(I input) throws Exception;
}
