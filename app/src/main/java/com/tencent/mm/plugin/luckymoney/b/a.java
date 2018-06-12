package com.tencent.mm.plugin.luckymoney.b;

public final class a
  extends com.tencent.mm.bk.a
{
  public int ddp;
  public String kPw;
  public String kPx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.ddp);
      if (this.kPw != null) {
        paramVarArgs.g(2, this.kPw);
      }
      if (this.kPx != null) {
        paramVarArgs.g(3, this.kPx);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.ddp) + 0;
      paramInt = i;
      if (this.kPw != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.kPw);
      }
      i = paramInt;
    } while (this.kPx == null);
    return paramInt + f.a.a.b.b.a.h(3, this.kPx);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locala1.ddp = locala.vHC.rY();
        return 0;
      case 2: 
        locala1.kPw = locala.vHC.readString();
        return 0;
      }
      locala1.kPx = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */