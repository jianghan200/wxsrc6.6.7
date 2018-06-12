package com.tencent.mm.plugin.product.c;

public final class n
  extends com.tencent.mm.bk.a
{
  public String bPS;
  public int bWA;
  public String lRX;
  public String name;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bPS != null) {
        paramVarArgs.g(1, this.bPS);
      }
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      if (this.lRX != null) {
        paramVarArgs.g(3, this.lRX);
      }
      if (this.username != null) {
        paramVarArgs.g(4, this.username);
      }
      paramVarArgs.fT(5, this.bWA);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bPS == null) {
        break label379;
      }
    }
    label379:
    for (int i = f.a.a.b.b.a.h(1, this.bPS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.name != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.name);
      }
      i = paramInt;
      if (this.lRX != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lRX);
      }
      paramInt = i;
      if (this.username != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.username);
      }
      return paramInt + f.a.a.a.fQ(5, this.bWA);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        n localn = (n)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localn.bPS = locala.vHC.readString();
          return 0;
        case 2: 
          localn.name = locala.vHC.readString();
          return 0;
        case 3: 
          localn.lRX = locala.vHC.readString();
          return 0;
        case 4: 
          localn.username = locala.vHC.readString();
          return 0;
        }
        localn.bWA = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */