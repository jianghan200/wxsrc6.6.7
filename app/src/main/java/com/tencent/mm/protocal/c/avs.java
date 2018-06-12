package com.tencent.mm.protocal.c;

public final class avs
  extends com.tencent.mm.bk.a
{
  public String rYI;
  public String rYJ;
  public int rYK;
  public int rYL;
  public int rYM;
  public int rYN;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rYI != null) {
        paramVarArgs.g(1, this.rYI);
      }
      if (this.rYJ != null) {
        paramVarArgs.g(2, this.rYJ);
      }
      paramVarArgs.fT(3, this.rYK);
      paramVarArgs.fT(4, this.rYL);
      paramVarArgs.fT(5, this.rYM);
      paramVarArgs.fT(7, this.rYN);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rYI == null) {
        break label386;
      }
    }
    label386:
    for (paramInt = f.a.a.b.b.a.h(1, this.rYI) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rYJ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rYJ);
      }
      return i + f.a.a.a.fQ(3, this.rYK) + f.a.a.a.fQ(4, this.rYL) + f.a.a.a.fQ(5, this.rYM) + f.a.a.a.fQ(7, this.rYN);
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
        avs localavs = (avs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 6: 
        default: 
          return -1;
        case 1: 
          localavs.rYI = locala.vHC.readString();
          return 0;
        case 2: 
          localavs.rYJ = locala.vHC.readString();
          return 0;
        case 3: 
          localavs.rYK = locala.vHC.rY();
          return 0;
        case 4: 
          localavs.rYL = locala.vHC.rY();
          return 0;
        case 5: 
          localavs.rYM = locala.vHC.rY();
          return 0;
        }
        localavs.rYN = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/avs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */