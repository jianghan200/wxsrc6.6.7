package com.tencent.mm.plugin.luckymoney.b;

public final class ai
  extends com.tencent.mm.bk.a
{
  public String content;
  public int ddp;
  public String iconUrl;
  public int kRD;
  public int kRE;
  public String name;
  public String type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.ddp);
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      if (this.type != null) {
        paramVarArgs.g(3, this.type);
      }
      if (this.content != null) {
        paramVarArgs.g(4, this.content);
      }
      paramVarArgs.fT(5, this.kRD);
      if (this.iconUrl != null) {
        paramVarArgs.g(6, this.iconUrl);
      }
      paramVarArgs.fT(7, this.kRE);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.ddp) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.name);
      }
      i = paramInt;
      if (this.type != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.type);
      }
      paramInt = i;
      if (this.content != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.content);
      }
      i = paramInt + f.a.a.a.fQ(5, this.kRD);
      paramInt = i;
      if (this.iconUrl != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.iconUrl);
      }
      return paramInt + f.a.a.a.fQ(7, this.kRE);
    }
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
      ai localai = (ai)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localai.ddp = locala.vHC.rY();
        return 0;
      case 2: 
        localai.name = locala.vHC.readString();
        return 0;
      case 3: 
        localai.type = locala.vHC.readString();
        return 0;
      case 4: 
        localai.content = locala.vHC.readString();
        return 0;
      case 5: 
        localai.kRD = locala.vHC.rY();
        return 0;
      case 6: 
        localai.iconUrl = locala.vHC.readString();
        return 0;
      }
      localai.kRE = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */