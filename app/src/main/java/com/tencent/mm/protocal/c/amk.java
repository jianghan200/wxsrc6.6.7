package com.tencent.mm.protocal.c;

public final class amk
  extends com.tencent.mm.bk.a
{
  public String mug;
  public String rPb;
  public long rPc;
  public String rPd;
  public String rPe;
  public String rPf;
  public String rlf;
  public int state;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rlf != null) {
        paramVarArgs.g(1, this.rlf);
      }
      paramVarArgs.fT(2, this.state);
      if (this.title != null) {
        paramVarArgs.g(3, this.title);
      }
      if (this.rPb != null) {
        paramVarArgs.g(4, this.rPb);
      }
      paramVarArgs.T(5, this.rPc);
      if (this.rPd != null) {
        paramVarArgs.g(6, this.rPd);
      }
      if (this.mug != null) {
        paramVarArgs.g(7, this.mug);
      }
      if (this.rPe != null) {
        paramVarArgs.g(8, this.rPe);
      }
      if (this.rPf != null) {
        paramVarArgs.g(9, this.rPf);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rlf == null) {
        break label595;
      }
    }
    label595:
    for (paramInt = f.a.a.b.b.a.h(1, this.rlf) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.state);
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.title);
      }
      i = paramInt;
      if (this.rPb != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rPb);
      }
      i += f.a.a.a.S(5, this.rPc);
      paramInt = i;
      if (this.rPd != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rPd);
      }
      i = paramInt;
      if (this.mug != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.mug);
      }
      paramInt = i;
      if (this.rPe != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rPe);
      }
      i = paramInt;
      if (this.rPf != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rPf);
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
        amk localamk = (amk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localamk.rlf = locala.vHC.readString();
          return 0;
        case 2: 
          localamk.state = locala.vHC.rY();
          return 0;
        case 3: 
          localamk.title = locala.vHC.readString();
          return 0;
        case 4: 
          localamk.rPb = locala.vHC.readString();
          return 0;
        case 5: 
          localamk.rPc = locala.vHC.rZ();
          return 0;
        case 6: 
          localamk.rPd = locala.vHC.readString();
          return 0;
        case 7: 
          localamk.mug = locala.vHC.readString();
          return 0;
        case 8: 
          localamk.rPe = locala.vHC.readString();
          return 0;
        }
        localamk.rPf = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/amk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */