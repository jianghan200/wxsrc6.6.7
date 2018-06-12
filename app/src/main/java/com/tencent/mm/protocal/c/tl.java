package com.tencent.mm.protocal.c;

public final class tl
  extends com.tencent.mm.bk.a
{
  public String jPG;
  public int rgA;
  public String rwK;
  public String rwL;
  public int rwM;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwL != null) {
        paramVarArgs.g(1, this.rwL);
      }
      paramVarArgs.fT(2, this.rgA);
      paramVarArgs.fT(3, this.rwM);
      if (this.jPG != null) {
        paramVarArgs.g(4, this.jPG);
      }
      if (this.rwK != null) {
        paramVarArgs.g(5, this.rwK);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwL == null) {
        break label363;
      }
    }
    label363:
    for (paramInt = f.a.a.b.b.a.h(1, this.rwL) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rgA) + f.a.a.a.fQ(3, this.rwM);
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPG);
      }
      i = paramInt;
      if (this.rwK != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rwK);
      }
      return i;
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
        tl localtl = (tl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localtl.rwL = locala.vHC.readString();
          return 0;
        case 2: 
          localtl.rgA = locala.vHC.rY();
          return 0;
        case 3: 
          localtl.rwM = locala.vHC.rY();
          return 0;
        case 4: 
          localtl.jPG = locala.vHC.readString();
          return 0;
        }
        localtl.rwK = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/tl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */