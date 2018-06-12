package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bwy
  extends com.tencent.mm.bk.a
{
  public int apptype;
  public String bPS;
  public String dxK;
  public String hyz;
  public int rXP;
  public LinkedList<bwz> stm = new LinkedList();
  public String stn;
  public int sto;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bPS != null) {
        paramVarArgs.g(1, this.bPS);
      }
      if (this.dxK != null) {
        paramVarArgs.g(2, this.dxK);
      }
      paramVarArgs.fT(3, this.apptype);
      paramVarArgs.d(4, 8, this.stm);
      paramVarArgs.fT(5, this.rXP);
      if (this.stn != null) {
        paramVarArgs.g(6, this.stn);
      }
      if (this.hyz != null) {
        paramVarArgs.g(7, this.hyz);
      }
      paramVarArgs.fT(8, this.sto);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bPS == null) {
        break label594;
      }
    }
    label594:
    for (paramInt = f.a.a.b.b.a.h(1, this.bPS) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.dxK != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.dxK);
      }
      i = i + f.a.a.a.fQ(3, this.apptype) + f.a.a.a.c(4, 8, this.stm) + f.a.a.a.fQ(5, this.rXP);
      paramInt = i;
      if (this.stn != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.stn);
      }
      i = paramInt;
      if (this.hyz != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.hyz);
      }
      return i + f.a.a.a.fQ(8, this.sto);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.stm.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bwy localbwy = (bwy)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbwy.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbwy.dxK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbwy.apptype = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bwz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bwz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbwy.stm.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localbwy.rXP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbwy.stn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbwy.hyz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbwy.sto = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bwy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */