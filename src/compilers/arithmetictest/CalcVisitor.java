package compilers.arithmetictest;

import java.util.HashMap;

public class CalcVisitor extends ArithmeticTestBaseVisitor<Integer> {

    HashMap<String, Integer> map = new HashMap<>();

    @Override
    public Integer visitAssign(ArithmeticTestParser.AssignContext ctx) {
        int value = visit(ctx.expr());
        map.put(ctx.ID().getText(), value);
        return value;
    }

    @Override
    public Integer visitPrintExpr(ArithmeticTestParser.PrintExprContext ctx) {
        int value = visit(ctx.expr());
        System.out.println(value);
        return 0;
    }

    @Override
    public Integer visitInt(ArithmeticTestParser.IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitId(ArithmeticTestParser.IdContext ctx) {
        String key = ctx.ID().getText();
        if (map.containsKey(key))
            return map.get(key);
        return 0;
    }

    @Override
    public Integer visitMul(ArithmeticTestParser.MulContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == ArithmeticTestParser.DIV)
            return left/right;
        return left*right;
    }

    @Override
    public Integer visitAdd(ArithmeticTestParser.AddContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == ArithmeticTestParser.ADD)
            return left + right;
        return left - right;
    }

    @Override
    public Integer visitParens(ArithmeticTestParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
