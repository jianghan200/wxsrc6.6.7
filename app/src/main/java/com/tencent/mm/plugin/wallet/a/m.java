package com.tencent.mm.plugin.wallet.a;

public final class m
  extends com.tencent.mm.bk.a
{
  public String dzE;
  public int id;
  public String name;
  public String pdR;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.id);
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      if (this.url != null) {
        paramVarArgs.g(3, this.url);
      }
      if (this.pdR != null) {
        paramVarArgs.g(4, this.pdR);
      }
      if (this.dzE != null) {
        paramVarArgs.g(5, this.dzE);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.id) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.name);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.url);
      }
      paramInt = i;
      if (this.pdR != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.pdR);
      }
      i = paramInt;
    } while (this.dzE == null);
    return paramInt + f.a.a.b.b.a.h(5, this.dzE);
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
      m localm = (m)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localm.id = locala.vHC.rY();
        return 0;
      case 2: 
        localm.name = locala.vHC.readString();
        return 0;
      case 3: 
        localm.url = locala.vHC.readString();
        return 0;
      case 4: 
        localm.pdR = locala.vHC.readString();
        return 0;
      }
      localm.dzE = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */