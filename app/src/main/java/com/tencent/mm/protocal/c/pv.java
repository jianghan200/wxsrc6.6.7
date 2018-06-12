package com.tencent.mm.protocal.c;

public final class pv
  extends com.tencent.mm.bk.a
{
  public String bIO;
  public String bIP;
  public int rua;
  public int rub;
  public String ruc;
  public int version;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.version);
      paramVarArgs.fT(2, this.rua);
      paramVarArgs.fT(3, this.rub);
      if (this.bIP != null) {
        paramVarArgs.g(4, this.bIP);
      }
      if (this.ruc != null) {
        paramVarArgs.g(5, this.ruc);
      }
      if (this.bIO != null) {
        paramVarArgs.g(6, this.bIO);
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
      i = f.a.a.a.fQ(1, this.version) + 0 + f.a.a.a.fQ(2, this.rua) + f.a.a.a.fQ(3, this.rub);
      paramInt = i;
      if (this.bIP != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.bIP);
      }
      i = paramInt;
      if (this.ruc != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.ruc);
      }
      paramInt = i;
    } while (this.bIO == null);
    return i + f.a.a.b.b.a.h(6, this.bIO);
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
      pv localpv = (pv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localpv.version = locala.vHC.rY();
        return 0;
      case 2: 
        localpv.rua = locala.vHC.rY();
        return 0;
      case 3: 
        localpv.rub = locala.vHC.rY();
        return 0;
      case 4: 
        localpv.bIP = locala.vHC.readString();
        return 0;
      case 5: 
        localpv.ruc = locala.vHC.readString();
        return 0;
      }
      localpv.bIO = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/pv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */