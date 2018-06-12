package com.tencent.mm.plugin.backup.h;

import f.a.a.b;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bk.a
{
  public String ID;
  public int hbA;
  public int hbB;
  public int hbC;
  public h hbt;
  public int hbu;
  public int hbv;
  public int hbw;
  public int hbx;
  public int hby;
  public int hbz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.g(1, this.ID);
      }
      if (this.hbt != null)
      {
        paramVarArgs.fV(2, this.hbt.boi());
        this.hbt.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.hbu);
      paramVarArgs.fT(4, this.hbv);
      paramVarArgs.fT(5, this.hbw);
      paramVarArgs.fT(6, this.hbx);
      paramVarArgs.fT(7, this.hby);
      paramVarArgs.fT(8, this.hbz);
      paramVarArgs.fT(9, this.hbA);
      paramVarArgs.fT(10, this.hbB);
      paramVarArgs.fT(11, this.hbC);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ID == null) {
        break label707;
      }
    }
    label707:
    for (paramInt = f.a.a.b.b.a.h(1, this.ID) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hbt != null) {
        i = paramInt + f.a.a.a.fS(2, this.hbt.boi());
      }
      return i + f.a.a.a.fQ(3, this.hbu) + f.a.a.a.fQ(4, this.hbv) + f.a.a.a.fQ(5, this.hbw) + f.a.a.a.fQ(6, this.hbx) + f.a.a.a.fQ(7, this.hby) + f.a.a.a.fQ(8, this.hbz) + f.a.a.a.fQ(9, this.hbA) + f.a.a.a.fQ(10, this.hbB) + f.a.a.a.fQ(11, this.hbC);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ID != null) {
          break;
        }
        throw new b("Not all required fields were included: ID");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        d locald = (d)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          locald.ID = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new h();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((h)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locald.hbt = ((h)localObject1);
            paramInt += 1;
          }
        case 3: 
          locald.hbu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          locald.hbv = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          locald.hbw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          locald.hbx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          locald.hby = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          locald.hbz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          locald.hbA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          locald.hbB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        locald.hbC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */