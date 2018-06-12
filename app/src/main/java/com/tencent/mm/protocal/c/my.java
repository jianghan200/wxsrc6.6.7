package com.tencent.mm.protocal.c;

public final class my
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public String rqY;
  public String rqZ;
  public String rra;
  public int rrb;
  public String rrc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.rqY != null) {
        paramVarArgs.g(3, this.rqY);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(4, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(5, this.rra);
      }
      paramVarArgs.fT(6, this.rrb);
      if (this.rrc != null) {
        paramVarArgs.g(7, this.rrc);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label497;
      }
    }
    label497:
    for (int i = f.a.a.b.b.a.h(1, this.hbL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.rqY != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rqY);
      }
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rqZ);
      }
      i = paramInt;
      if (this.rra != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rra);
      }
      i += f.a.a.a.fQ(6, this.rrb);
      paramInt = i;
      if (this.rrc != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rrc);
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
        my localmy = (my)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localmy.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localmy.hcS = locala.vHC.readString();
          return 0;
        case 3: 
          localmy.rqY = locala.vHC.readString();
          return 0;
        case 4: 
          localmy.rqZ = locala.vHC.readString();
          return 0;
        case 5: 
          localmy.rra = locala.vHC.readString();
          return 0;
        case 6: 
          localmy.rrb = locala.vHC.rY();
          return 0;
        }
        localmy.rrc = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */