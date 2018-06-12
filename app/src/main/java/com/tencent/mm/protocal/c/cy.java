package com.tencent.mm.protocal.c;

public final class cy
  extends com.tencent.mm.bk.a
{
  public int jPZ;
  public String jPg;
  public String rcY;
  public long rcZ;
  public String rda;
  public String rdb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcY != null) {
        paramVarArgs.g(1, this.rcY);
      }
      if (this.jPg != null) {
        paramVarArgs.g(2, this.jPg);
      }
      paramVarArgs.T(3, this.rcZ);
      if (this.rda != null) {
        paramVarArgs.g(4, this.rda);
      }
      if (this.rdb != null) {
        paramVarArgs.g(5, this.rdb);
      }
      paramVarArgs.fT(6, this.jPZ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rcY == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = f.a.a.b.b.a.h(1, this.rcY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jPg != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jPg);
      }
      i += f.a.a.a.S(3, this.rcZ);
      paramInt = i;
      if (this.rda != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rda);
      }
      i = paramInt;
      if (this.rdb != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rdb);
      }
      return i + f.a.a.a.fQ(6, this.jPZ);
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
        cy localcy = (cy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcy.rcY = locala.vHC.readString();
          return 0;
        case 2: 
          localcy.jPg = locala.vHC.readString();
          return 0;
        case 3: 
          localcy.rcZ = locala.vHC.rZ();
          return 0;
        case 4: 
          localcy.rda = locala.vHC.readString();
          return 0;
        case 5: 
          localcy.rdb = locala.vHC.readString();
          return 0;
        }
        localcy.jPZ = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */