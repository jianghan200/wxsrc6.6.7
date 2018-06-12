package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class nd
  extends bhd
{
  public String ecE;
  public String jTu;
  public String jTv;
  public int rdY;
  public String rmy;
  public long rri;
  public String rrj;
  public String rrk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jTv != null) {
        paramVarArgs.g(2, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(3, this.jTu);
      }
      paramVarArgs.T(4, this.rri);
      if (this.rmy != null) {
        paramVarArgs.g(5, this.rmy);
      }
      if (this.rrj != null) {
        paramVarArgs.g(6, this.rrj);
      }
      paramVarArgs.fT(7, this.rdY);
      if (this.rrk != null) {
        paramVarArgs.g(8, this.rrk);
      }
      if (this.ecE != null) {
        paramVarArgs.g(9, this.ecE);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label689;
      }
    }
    label689:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jTv != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jTv);
      }
      i = paramInt;
      if (this.jTu != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jTu);
      }
      i += f.a.a.a.S(4, this.rri);
      paramInt = i;
      if (this.rmy != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rmy);
      }
      i = paramInt;
      if (this.rrj != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rrj);
      }
      i += f.a.a.a.fQ(7, this.rdY);
      paramInt = i;
      if (this.rrk != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rrk);
      }
      i = paramInt;
      if (this.ecE != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.ecE);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        nd localnd = (nd)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localnd.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localnd.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localnd.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localnd.rri = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localnd.rmy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localnd.rrj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localnd.rdY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localnd.rrk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localnd.ecE = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */