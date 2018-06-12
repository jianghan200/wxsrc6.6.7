package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bqz
  extends bhd
{
  public String jTu;
  public String jTv;
  public String rdo;
  public int spd;
  public int spe;
  public LinkedList<brb> spf = new LinkedList();
  public bqy spg;
  public int sph;
  public LinkedList<bqy> spi = new LinkedList();
  
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
      paramVarArgs.fT(2, this.spd);
      if (this.jTv != null) {
        paramVarArgs.g(3, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(4, this.jTu);
      }
      if (this.rdo != null) {
        paramVarArgs.g(5, this.rdo);
      }
      paramVarArgs.fT(6, this.spe);
      paramVarArgs.d(7, 8, this.spf);
      if (this.spg != null)
      {
        paramVarArgs.fV(8, this.spg.boi());
        this.spg.a(paramVarArgs);
      }
      paramVarArgs.fT(9, this.sph);
      paramVarArgs.d(10, 8, this.spi);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label970;
      }
    }
    label970:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.spd);
      paramInt = i;
      if (this.jTv != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jTv);
      }
      i = paramInt;
      if (this.jTu != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jTu);
      }
      paramInt = i;
      if (this.rdo != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rdo);
      }
      i = paramInt + f.a.a.a.fQ(6, this.spe) + f.a.a.a.c(7, 8, this.spf);
      paramInt = i;
      if (this.spg != null) {
        paramInt = i + f.a.a.a.fS(8, this.spg.boi());
      }
      return paramInt + f.a.a.a.fQ(9, this.sph) + f.a.a.a.c(10, 8, this.spi);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.spf.clear();
        this.spi.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        bqz localbqz = (bqz)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbqz.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbqz.spd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbqz.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbqz.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbqz.rdo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbqz.spe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new brb();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((brb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbqz.spf.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bqy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbqz.spg = ((bqy)localObject1);
            paramInt += 1;
          }
        case 9: 
          localbqz.sph = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbqz.spi.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */