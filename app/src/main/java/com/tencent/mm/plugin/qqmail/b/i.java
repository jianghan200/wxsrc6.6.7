package com.tencent.mm.plugin.qqmail.b;

import f.a.a.b;

public final class i
  extends com.tencent.mm.bk.a
{
  public String kCs;
  public int mcB;
  public int mcC;
  public String mcD;
  public String name;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.name == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.kCs == null) {
        throw new b("Not all required fields were included: addr");
      }
      paramVarArgs.fT(1, this.mcB);
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      if (this.kCs != null) {
        paramVarArgs.g(3, this.kCs);
      }
      paramVarArgs.fT(4, this.mcC);
      if (this.mcD != null) {
        paramVarArgs.g(5, this.mcD);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.mcB) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.name);
      }
      i = paramInt;
      if (this.kCs != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.kCs);
      }
      i += f.a.a.a.fQ(4, this.mcC);
      paramInt = i;
    } while (this.mcD == null);
    return i + f.a.a.b.b.a.h(5, this.mcD);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.name == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.kCs == null) {
        throw new b("Not all required fields were included: addr");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locali.mcB = locala.vHC.rY();
        return 0;
      case 2: 
        locali.name = locala.vHC.readString();
        return 0;
      case 3: 
        locali.kCs = locala.vHC.readString();
        return 0;
      case 4: 
        locali.mcC = locala.vHC.rY();
        return 0;
      }
      locali.mcD = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */