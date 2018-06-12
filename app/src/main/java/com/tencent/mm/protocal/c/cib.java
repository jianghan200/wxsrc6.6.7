package com.tencent.mm.protocal.c;

public final class cib
  extends com.tencent.mm.bk.a
{
  public String jTB;
  public String jTC;
  public int jTD;
  public String jTz;
  public String rcY;
  public int sBY;
  public String sBZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sBY);
      if (this.rcY != null) {
        paramVarArgs.g(2, this.rcY);
      }
      if (this.jTz != null) {
        paramVarArgs.g(3, this.jTz);
      }
      if (this.sBZ != null) {
        paramVarArgs.g(4, this.sBZ);
      }
      if (this.jTB != null) {
        paramVarArgs.g(5, this.jTB);
      }
      if (this.jTC != null) {
        paramVarArgs.g(6, this.jTC);
      }
      paramVarArgs.fT(7, this.jTD);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.sBY) + 0;
      paramInt = i;
      if (this.rcY != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rcY);
      }
      i = paramInt;
      if (this.jTz != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jTz);
      }
      paramInt = i;
      if (this.sBZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sBZ);
      }
      i = paramInt;
      if (this.jTB != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jTB);
      }
      paramInt = i;
      if (this.jTC != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jTC);
      }
      return paramInt + f.a.a.a.fQ(7, this.jTD);
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
      cib localcib = (cib)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcib.sBY = locala.vHC.rY();
        return 0;
      case 2: 
        localcib.rcY = locala.vHC.readString();
        return 0;
      case 3: 
        localcib.jTz = locala.vHC.readString();
        return 0;
      case 4: 
        localcib.sBZ = locala.vHC.readString();
        return 0;
      case 5: 
        localcib.jTB = locala.vHC.readString();
        return 0;
      case 6: 
        localcib.jTC = locala.vHC.readString();
        return 0;
      }
      localcib.jTD = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/cib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */