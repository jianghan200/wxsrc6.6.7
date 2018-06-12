package com.tencent.mm.protocal.c;

public final class wg
  extends com.tencent.mm.bk.a
{
  public int hcd;
  public int rbY;
  public int rbZ;
  public int rca;
  public int rcb;
  public String rcf;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rbY);
      paramVarArgs.fT(2, this.hcd);
      if (this.rcf != null) {
        paramVarArgs.g(3, this.rcf);
      }
      paramVarArgs.fT(4, this.rbZ);
      paramVarArgs.fT(5, this.rca);
      paramVarArgs.fT(6, this.rcb);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rbY) + 0 + f.a.a.a.fQ(2, this.hcd);
      paramInt = i;
      if (this.rcf != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rcf);
      }
      return paramInt + f.a.a.a.fQ(4, this.rbZ) + f.a.a.a.fQ(5, this.rca) + f.a.a.a.fQ(6, this.rcb);
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
      wg localwg = (wg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localwg.rbY = locala.vHC.rY();
        return 0;
      case 2: 
        localwg.hcd = locala.vHC.rY();
        return 0;
      case 3: 
        localwg.rcf = locala.vHC.readString();
        return 0;
      case 4: 
        localwg.rbZ = locala.vHC.rY();
        return 0;
      case 5: 
        localwg.rca = locala.vHC.rY();
        return 0;
      }
      localwg.rcb = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/wg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */