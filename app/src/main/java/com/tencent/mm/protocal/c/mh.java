package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class mh
  extends bhd
{
  public int amount;
  public int bVU;
  public String myf;
  public String rqp;
  public String rqs;
  public String rqt;
  public int rqu;
  public String rqv;
  public String rqw;
  public String rqx;
  public String rqy;
  public int rqz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rqs == null) {
        throw new b("Not all required fields were included: receiver_name");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rqs != null) {
        paramVarArgs.g(2, this.rqs);
      }
      paramVarArgs.fT(3, this.amount);
      if (this.rqt != null) {
        paramVarArgs.g(4, this.rqt);
      }
      if (this.myf != null) {
        paramVarArgs.g(5, this.myf);
      }
      paramVarArgs.fT(6, this.rqu);
      paramVarArgs.fT(7, this.bVU);
      if (this.rqv != null) {
        paramVarArgs.g(8, this.rqv);
      }
      if (this.rqp != null) {
        paramVarArgs.g(9, this.rqp);
      }
      if (this.rqw != null) {
        paramVarArgs.g(10, this.rqw);
      }
      if (this.rqx != null) {
        paramVarArgs.g(11, this.rqx);
      }
      if (this.rqy != null) {
        paramVarArgs.g(12, this.rqy);
      }
      paramVarArgs.fT(13, this.rqz);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label913;
      }
    }
    label913:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rqs != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rqs);
      }
      i += f.a.a.a.fQ(3, this.amount);
      paramInt = i;
      if (this.rqt != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rqt);
      }
      i = paramInt;
      if (this.myf != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.myf);
      }
      i = i + f.a.a.a.fQ(6, this.rqu) + f.a.a.a.fQ(7, this.bVU);
      paramInt = i;
      if (this.rqv != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rqv);
      }
      i = paramInt;
      if (this.rqp != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rqp);
      }
      paramInt = i;
      if (this.rqw != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rqw);
      }
      i = paramInt;
      if (this.rqx != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rqx);
      }
      paramInt = i;
      if (this.rqy != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rqy);
      }
      return paramInt + f.a.a.a.fQ(13, this.rqz);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rqs != null) {
          break;
        }
        throw new b("Not all required fields were included: receiver_name");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        mh localmh = (mh)paramVarArgs[1];
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
            localmh.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localmh.rqs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localmh.amount = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localmh.rqt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localmh.myf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localmh.rqu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localmh.bVU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localmh.rqv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localmh.rqp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localmh.rqw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localmh.rqx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localmh.rqy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localmh.rqz = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/mh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */