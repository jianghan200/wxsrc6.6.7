package com.tencent.mm.protocal.c;

public final class bib
  extends com.tencent.mm.bk.a
{
  public String jPe;
  public int lOH;
  public String reT;
  public String rvq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPe != null) {
        paramVarArgs.g(1, this.jPe);
      }
      if (this.rvq != null) {
        paramVarArgs.g(2, this.rvq);
      }
      if (this.reT != null) {
        paramVarArgs.g(3, this.reT);
      }
      paramVarArgs.fT(4, this.lOH);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPe == null) {
        break label324;
      }
    }
    label324:
    for (int i = f.a.a.b.b.a.h(1, this.jPe) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rvq != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rvq);
      }
      i = paramInt;
      if (this.reT != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.reT);
      }
      return i + f.a.a.a.fQ(4, this.lOH);
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
        bib localbib = (bib)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbib.jPe = locala.vHC.readString();
          return 0;
        case 2: 
          localbib.rvq = locala.vHC.readString();
          return 0;
        case 3: 
          localbib.reT = locala.vHC.readString();
          return 0;
        }
        localbib.lOH = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */