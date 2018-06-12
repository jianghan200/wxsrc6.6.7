package com.tencent.mm.protocal.c;

public final class ly
  extends com.tencent.mm.bk.a
{
  public String cac;
  public int end_time;
  public String hyB;
  public int rqg;
  public String rqh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.cac != null) {
        paramVarArgs.g(1, this.cac);
      }
      if (this.hyB != null) {
        paramVarArgs.g(2, this.hyB);
      }
      paramVarArgs.fT(3, this.end_time);
      paramVarArgs.fT(4, this.rqg);
      if (this.rqh != null) {
        paramVarArgs.g(5, this.rqh);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.cac == null) {
        break label363;
      }
    }
    label363:
    for (paramInt = f.a.a.b.b.a.h(1, this.cac) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hyB != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hyB);
      }
      i = i + f.a.a.a.fQ(3, this.end_time) + f.a.a.a.fQ(4, this.rqg);
      paramInt = i;
      if (this.rqh != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rqh);
      }
      return paramInt;
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
        ly locally = (ly)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          locally.cac = locala.vHC.readString();
          return 0;
        case 2: 
          locally.hyB = locala.vHC.readString();
          return 0;
        case 3: 
          locally.end_time = locala.vHC.rY();
          return 0;
        case 4: 
          locally.rqg = locala.vHC.rY();
          return 0;
        }
        locally.rqh = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */